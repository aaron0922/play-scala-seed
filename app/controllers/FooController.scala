package controllers

import javax.inject.Inject
import play.api.mvc.BaseController
import play.api.mvc.ControllerComponents

class FooController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def get = Action {
    Ok("Hello foo")
  }
}
