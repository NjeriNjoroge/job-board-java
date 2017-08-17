import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/form", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/form", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      String title = request.queryParams("title");
      String name = request.queryParams("name");
      String description = request.queryParams("description");
      String phoneNumber = request.queryParams("telephone");
      Integer telephone = Integer.parseInt(phoneNumber);
      Job newJob = new Job(title, name, description, telephone);
      request.session().attribute("job", newJob)

      model.put("template", "templates/forms");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
