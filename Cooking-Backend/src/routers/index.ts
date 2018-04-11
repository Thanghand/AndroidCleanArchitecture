/**
 * application main router
 */
import * as express from 'express';
import RecipeRouter from './FakeData/Recipe';

const api = express.Router();
api.use('/recipe', RecipeRouter);

export default api;