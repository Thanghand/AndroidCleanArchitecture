
import * as mongoose from 'mongoose';

export interface IRead<T extends mongoose.Document> {
  retrieve: (callback: (error: any, result: any) => void) => void;
  findById(id: string, callback?: (error: any, result: T) => void): mongoose.DocumentQuery<T, T>;
  findOne(cond?: Object, callback?: (err: any, res: T) => void): mongoose.DocumentQuery<T, T>;
  find(cond: Object, fields: Object, options: Object, callback?: (err: any, res: T[]) => void): mongoose.Query<T[]>;
  findByIdAndUpdate(_id: string, update: any, callback?: (error: any, result: any) => void): mongoose.DocumentQuery<T, T>;
}

export interface IWrite<T> {
  create: (item: T) => Promise<T>;
  update(_id: mongoose.Types.ObjectId, item: T, callback: (error: any, result: any) => void): mongoose.Query<any>;
  delete: (_id: string, callback: (error: any, result: any) => void) => void;
}

export class BaseDao<T extends mongoose.Document> implements IRead<T>, IWrite<T>  {

  private _model: mongoose.Model<T>;

  constructor(schemaModel: mongoose.Model<T>) {
    this._model = schemaModel;
  }

  create(item: T): Promise<T> {
    return this._model.create(item);
  }

  retrieve(callback: (error: any, result: T) => void) {
    this._model.find({}, callback);
  }

  update(_id: mongoose.Types.ObjectId, item: T, callback: (error: any, result: any) => void): any {
    this._model.update({ _id: _id }, item, callback);
  }

  delete(_id: string, callback?: (error: any, result: any) => void) {
    this._model.remove({ _id: this.toObjectId(_id) }, (err) => callback(err, null));
  }

  findById(_id: string, callback?: (error: any, result: T) => void): mongoose.DocumentQuery<T, T> {
    return this._model.findById(_id, callback);
  }

  findOne(cond?: Object, callback?: (err: any, res: T) => void): mongoose.DocumentQuery<T, T> {
    return this._model.findOne(cond, callback);
  }

  find(cond?: Object, fields?: Object, options?: Object, callback?: (err: any, res: T[]) => void): mongoose.Query<T[]> {
    return this._model.find(cond, options, callback);
  }
  findByIdAndUpdate(_id: string, update: any, callback?: (error: any, result: any) => void): mongoose.DocumentQuery<T, T> {
    return this._model.findByIdAndUpdate(_id, update);
  }
  private toObjectId(_id: string): mongoose.Types.ObjectId {
    return mongoose.Types.ObjectId.createFromHexString(_id);
  }

} 