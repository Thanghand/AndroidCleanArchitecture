import { Document } from "mongoose";

export default abstract class BaseModelRequest<T extends Document> {

    constructor(data: any) {
        this.mapperDataJsonToProperties(data);
    }

    abstract mapperDataJsonToProperties(data: any);

    getModelDocument(): T {
        return null;
    }
}