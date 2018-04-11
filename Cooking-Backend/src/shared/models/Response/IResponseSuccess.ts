import { IResponse } from "./IResponse";

export interface IResponseSuccess extends IResponse {
    data?: any;
}