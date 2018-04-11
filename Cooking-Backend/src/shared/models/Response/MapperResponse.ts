import { IResponseSuccess } from "../../../shared/models/Response/IResponseSuccess";
import { IResponse } from "../../../shared/models/Response/IResponse";

export default class MapperResponse {

    static mapResponseToResJson(res: any, response: IResponse): any {

        let newRes = Object.assign(res);
        newRes.status(response.statusCode);

        //exclude status code 
        delete response.statusCode;

        newRes.json(response);
        return newRes;
    }
}