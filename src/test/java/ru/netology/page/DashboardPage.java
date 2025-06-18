package ru.netology.page;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    private SelenideElement heading = Selenide.$("[data-test-id=dashboard]");
    public DashboardPage() {
        heading.shouldBe(Condition.visible);
    }
}