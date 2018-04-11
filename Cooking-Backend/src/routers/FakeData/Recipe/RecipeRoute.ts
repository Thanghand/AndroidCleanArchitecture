import { BaseRoute } from "../../../shared/core/BaseRoute";
import RecipePresenter from "./RecipePresenter";
import { Router, Request, Response } from "express";
import MapperResponse from "../../../shared/models/Response/MapperResponse";

export default class RecipeRoute extends BaseRoute {
    private recipePresenter: RecipePresenter;

    constructor(){
        super();
        this.recipePresenter = new RecipePresenter();
    }

    public getRecipesAction(router: Router): void {
        router.get('/:keyword?/:category/:page', async (req: Request, res: Response) => {
            var page = req.params.page;
            var category = req.params.category;
            var keyword = req.params.keyword;
            let responseMessage = await this.recipePresenter.getRecipes(page, category, keyword);
            res = MapperResponse.mapResponseToResJson(res, responseMessage);
        });
    }
}