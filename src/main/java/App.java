import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Hero;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        //home
        get("/",(request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        //new squad form
        get("/squadform",(request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "squad-form.hbs");
        }, new HandlebarsTemplateEngine());

        //post filled squad form
        post("/squad",(request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            int maxSize = Integer.parseInt(request.queryParams("maxSize"));
            request.session().attribute("maxSize", maxSize);
            String squadName = request.queryParams("squadName");
            request.session().attribute("squadName", squadName);
            String cause = request.queryParams("cause");
            request.session().attribute("cause", cause);
            Squad squad = new Squad(maxSize,squadName,cause);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

        //show all squads
        get("/squad", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Squad> squads= Squad.all();
            model.put("squads", squads);
            return new ModelAndView(model, "squad.hbs");
        }, new HandlebarsTemplateEngine());

        //get individual squad
        get("/squads/:id", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            int idOfSquadToFind = Integer.parseInt(request.params("id"));
            Squad foundSquad = Squad.find(idOfSquadToFind);
            model.put("squad", foundSquad);
            return new ModelAndView(model, "squad-detail.hbs");
        }, new HandlebarsTemplateEngine());

        //form to create hero
        get("/hero",(request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "heroform.hbs");
        }, new HandlebarsTemplateEngine());

        //get all heroes
        get("/hero", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Hero> heroes = Hero.getHeroes();
            model.put("heroes",heroes);
            return new ModelAndView(model, "hero.hbs");
        }, new HandlebarsTemplateEngine());

        //post inputs from hero form
        post("/hero", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            request.session().attribute("name", name);
            int age = Integer.parseInt(request.queryParams("age"));
            request.session().attribute("age", age);
            String special_power = request.queryParams("special_power");
            request.session().attribute("special_power", special_power);
            String weakness = request.queryParams("weakness");
            request.session().attribute("weakness", weakness);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

        //new hero form
        get("squad/:id/hero/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "heroform.hbs");
        }, new HandlebarsTemplateEngine());

        //post new hero form to squad
        post("/herosquad", (request, response) -> {
            Map<String, Object> model = new HashMap();
            Squad squad = Squad.find(Integer.parseInt(request.queryParams(":id")));
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            request.session().attribute("age", age);
            String special_power = request.queryParams("special_power");
            request.session().attribute("special_power", special_power);
            String weakness = request.queryParams("weakness");
            request.session().attribute("weakness", weakness);
            Hero hero = new Hero(name,age,special_power,weakness);

            squad.addHero(hero);
            squad.getHeroes();
            model.put("squads", squad);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
