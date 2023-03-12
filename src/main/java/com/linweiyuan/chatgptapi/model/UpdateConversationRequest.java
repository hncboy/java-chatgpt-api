package com.linweiyuan.chatgptapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UpdateConversationRequest {
    private String title;
    @JsonProperty("is_visible")
    private Boolean isVisible = true;
}