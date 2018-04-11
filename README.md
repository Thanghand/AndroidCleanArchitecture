# AndroidCleanArchitecture
- Cooking (Android project)
- Cooking-Backend (You have to start your backend first)
```
$ npm install yarn -g
$ yarn install
$ yarn build
$ yarn start
```

### Problems when we use MVP, MVVM, MVC ...


### What is Clean Architecture? 
Architectural reactive approach
-----------------
![http://fernandocejas.com/2015/07/18/architecting-android-the-evolution/](https://github.com/android10/Sample-Data/blob/master/Android-CleanArchitecture/clean_architecture_layers_details.png)

- Clean Architecture is a mindset of designed structure project. If you have read the "Clean code", you will know the rules to make your code clean.
  1/ Readable
  2/ Maintainable
  3/ Scalable
  4/ Extendable
  5/ Testable
  
### Clean Architecture have the same rules with Clean Code.
  
- When you apply "Clean Architecture" in your project, you will split your code to many files and make them to be independent. Class does not dependence with orther.
It will do with its scope.

###  Do we need to split it to many files ? 

- Ok, I will give you some example here. 

- I have a project which apply MVP pattern. I have one Presenter to handle my bussiness case. If my presenter have 3 or 4 usecase, you will know that my code are really messy.

```
class HomePresenter {
  ... Many properties 
  ... Many variables to keep logic
  
  ... Logic A
  
  ...

}
```
- My presenter will do a lot of things, and it contain many propterites and varaibles which they don't want to know. And they can make side effect.
- If you maintain for this code, you really want to do it (@@).

### The solutions for it, I will split bussiness logic to every files. When presenter want to use it just call them. 

```
public class SearchRecipePresenter extends BasePresenter<SearchRecipeContract.ViewRecipeCallBack>
        implements SearchRecipeContract.Presenter {

    private final SearchRecipes searchRecipes;

    private final FilterRecipes filterRecipes;

    @Inject
    SearchRecipePresenter(SearchRecipes searchRecipes, FilterRecipes filterRecipes) {
        super(searchRecipes, filterRecipes);
        this.searchRecipes = searchRecipes;
        this.filterRecipes = filterRecipes;
    }
```
(This code in Cooking project)

* The code is very clean right. If SearchRecipes change bussiness logic, I just go to SearchRecipes and change. And I really confident my changes does not affect to another logic.
* Do you see @Inject anotation?  We use dagger 2 to Inject the object. Dagger 2 is a library dependency injection (https://github.com/google/dagger)
* If you apply Clean Architechture, you also should use Dagger 2. Because Dagger 2 is very helpful to inject object without knowing the parameter (A class shouldn’t know anything about how it is injected)






