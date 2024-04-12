package com.example.restAPI.demo.DTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ArticleResponse {
    String author;
    String publishedAt;
}
