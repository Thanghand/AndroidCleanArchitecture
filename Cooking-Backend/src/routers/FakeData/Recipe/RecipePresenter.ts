import BasePresenter from "../../../shared/core/BasePresenter";
import { IResponse } from "../../../shared/models/Response/IResponse";
import ResponseBuilder from "../../../shared/models/Response/ResponseBuilder";

var recipes = [
    {
        "Id": 27698,
        "Name": "Chè con ong dẻo cay",
        "TotalTime": 45,
        "Level": "Dễ",
        "LevelId": 0,
        "TotalView": 244,
        "TotalReviews": 0,
        "AvgRating": 0,
        "Img": "https://media.cooky.vn/recipe/g3/27698/s320x320/recipe-cover-r27698.jpg",
        "ImgMeta": "https://media.cooky.vn/recipe/g3/27698/s555x240/recipe-cover-r27698.jpg",
        "Category":"Chay"
    },
    {
        "Id": 22003,
        "Name": "Canh rau củ chay ngọt",
        "TotalTime": 0,
        "Level": "Dễ",
        "LevelId": 0,
        "TotalView": 1958,
        "TotalReviews": 0,
        "AvgRating": 9,
        "Img": "https://media.cooky.vn/recipe/g3/22003/s320x320/recipe22003-636414490390158865.jpg",
        "ImgMeta": "https://media.cooky.vn/recipe/g3/22003/s555x240/recipe22003-636414490390158865.jpg",
        "Category":"Chay"
    }
]
export default class RecipePresenter extends BasePresenter {

    async getRecipes(page: number, category: string, keyword: string):  Promise<IResponse> {
        try {
            let getRecipes = recipes;
            return new ResponseBuilder()
                .onSuccess()
                .setMessage("Get product detail")
                .setData(recipes)
                .build();

        } catch (error) {
            return new ResponseBuilder()
                .onError()
                .setMessage(error.code || "Get Product Detail error")
                .build();
        }
    }
}