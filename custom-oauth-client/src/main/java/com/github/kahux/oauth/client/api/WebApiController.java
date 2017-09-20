package com.github.kahux.oauth.client.api;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApiController {

  @RequestMapping(method = RequestMethod.GET, value = "/web/user")
  public Map<String, Object> showUserInfo(Principal principal) {
    Map<String, Object> map = new HashMap<>();
    map.put("user", principal.getName());
    return map;
  }
}
