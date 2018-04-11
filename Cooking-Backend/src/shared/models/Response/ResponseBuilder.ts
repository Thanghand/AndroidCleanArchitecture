import { IResponse } from "../../../shared/models/Response/IResponse";
import { IResponseSuccess } from "../../../shared/models/Response/IResponseSuccess";
import { IResponseError } from "../../../shared/models/Response/IResponseError";
import { IResponseToken } from "../../../shared/models/Response/IResponseToken";



export default class ResponseBuilder {
    private statusCode: number;
    private success: boolean;
    private data: any;
    private message: any;
    private token: string;
    onSuccess(): this {
        this.statusCode = 200;
        this.success = true;
        return this;
    }

    setData(data: any): this {
        this.data = data;
        return this;
    }

    setMessage(message: any): this {
        this.message = message;
        return this;
    }

    onError(): this {
        this.statusCode = 401;
        this.success = false;
        return this;
    }

    setToken(token: string) {
        this.token = token;
        return this;
    }

    build(): IResponse {
        if (!this.success) {
            return <IResponseError>{
                statusCode: this.statusCode,
                message: this.message
            }
        } else
            if (this.success && !this.token) {
                return <IResponseSuccess>{
                    statusCode: this.statusCode,
                    data: this.data,
                    message: this.message
                }
            } else {
                return <IResponseToken>{
                    statusCode: this.statusCode,
                    message: this.message,
                    token: this.token
                }
            }
    }
}