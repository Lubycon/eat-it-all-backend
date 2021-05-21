package com.lubycon.eatitall.api.controller;

import com.lubycon.eatitall.api.model.response.common.Response;
import com.lubycon.eatitall.api.model.response.restaurant.CurationRestaurantResponse;
import com.lubycon.eatitall.domain.restaurant.service.CurationRestaurantService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/curation")
public class CurationRestaurantController {

  private final CurationRestaurantService curationRestaurantService;

  @GetMapping("/{curationId}/restaurant")
  public ResponseEntity<Response> retrieveRestaurantsByCurationId(@PathVariable Long curationId) {
    List<CurationRestaurantResponse> curationRestaurants = curationRestaurantService.retrieveRestaurantsByCurationId(curationId);
    Response response = new Response("curationRestaurants", curationRestaurants);
    return ResponseEntity.ok().body(response);
  }

}
