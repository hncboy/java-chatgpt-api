package com.linweiyuan.chatgptapi.scheduler;

import com.linweiyuan.chatgptapi.annotation.EnabledOnChatGPT;
import com.linweiyuan.chatgptapi.misc.PlaywrightUtil;
import com.microsoft.playwright.Page;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnabledOnChatGPT
@Component
public class PageAutoReloadScheduler {
    private final Page page;

    public PageAutoReloadScheduler(Page page) {
        this.page = page;
    }

    // auto reload every 1 minutes
    @Scheduled(fixedRate = 60_000, initialDelay = 60_000)
    public void reload() {
        PlaywrightUtil.tryToReload(page);
    }
}
