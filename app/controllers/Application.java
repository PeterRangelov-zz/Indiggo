package controllers;

import play.*;
import play.mvc.*;
import dto.Action;
import views.html.*;

import java.util.ArrayList;
import java.util.List;
import scala.collection.JavaConverters;

public class Application extends Controller {


    public static Result index() {


        return ok(index.render(JavaConverters.asScalaBufferConverter(dto.Action.getMockActions(10)).asScala().toList()));
    }

}
