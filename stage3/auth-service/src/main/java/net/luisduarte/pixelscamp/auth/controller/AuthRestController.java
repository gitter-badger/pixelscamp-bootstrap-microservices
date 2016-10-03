package net.luisduarte.pixelscamp.auth.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthRestController {

  @RequestMapping(value = "/me", method = RequestMethod.GET, produces = APPLICATION_JSON_UTF8_VALUE)
  public Object me() {
    return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
  }
}
