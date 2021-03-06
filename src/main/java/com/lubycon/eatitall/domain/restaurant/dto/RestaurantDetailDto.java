package com.lubycon.eatitall.domain.restaurant.dto;

import com.lubycon.eatitall.domain.restaurant.model.Address;
import com.lubycon.eatitall.domain.restaurant.model.KakaoMap;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@AllArgsConstructor
@Getter
public class RestaurantDetailDto {

  @NotNull
  private final Long restaurantId;

  @NotNull
  private final String name;

  @Nullable
  private final String description;

  @Nullable
  private final String hashtags;

  @Nullable
  private final String thumbnailImageUrl;

  @NotNull
  private final Address address;

  @Nullable
  private final KakaoMap kakaoMap;

}
