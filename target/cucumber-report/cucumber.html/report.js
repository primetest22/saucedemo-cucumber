$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "As a user I want to purchase cheapest and costliest product from the saucedemo after sorting the products by Hight to Low filter.",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4748457600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User navigates saucedemo page and complete the item purchas",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchas",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on saucedemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I login with credential username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I filter the products by Price \"Price (high to low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select cheapest \u0026 costliest products and add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter details firstname \"Mahendra\", lastName \"Dhoni\" and zipPostalCode \"00000\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should be able to see message \u0027Thank you for your order\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "PurchasePageTest.iAmOnSaucedemoPage()"
});
formatter.result({
  "duration": 130447700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 34
    },
    {
      "val": "secret_sauce",
      "offset": 63
    }
  ],
  "location": "PurchasePageTest.iLoginWithCredentialUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 233540800,
  "status": "passed"
});
formatter.match({
  "location": "PurchasePageTest.iClickOnLoginButton()"
});
formatter.result({
  "duration": 148470000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 32
    }
  ],
  "location": "PurchasePageTest.iFilterTheProductsByPrice(String)"
});
formatter.result({
  "duration": 212248600,
  "status": "passed"
});
formatter.match({
  "location": "PurchasePageTest.iSelectCheapestCostliestProductsAndAddToBasket()"
});
formatter.result({
  "duration": 195481300,
  "status": "passed"
});
formatter.match({
  "location": "PurchasePageTest.iOpenShoppingCart()"
});
formatter.result({
  "duration": 85501000,
  "status": "passed"
});
formatter.match({
  "location": "PurchasePageTest.iGoToCheckout()"
});
formatter.result({
  "duration": 127490100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mahendra",
      "offset": 27
    },
    {
      "val": "Dhoni",
      "offset": 48
    },
    {
      "val": "00000",
      "offset": 74
    }
  ],
  "location": "PurchasePageTest.iEnterDetailsFirstnameLastNameAndZipPostalCode(String,String,String)"
});
formatter.result({
  "duration": 540541700,
  "status": "passed"
});
formatter.match({
  "location": "PurchasePageTest.iClickOnContinueButton()"
});
formatter.result({
  "duration": 116518100,
  "status": "passed"
});
formatter.match({
  "location": "PurchasePageTest.iClickOnFinishButton()"
});
formatter.result({
  "duration": 104999500,
  "status": "passed"
});
formatter.match({
  "location": "PurchasePageTest.iShouldBeAbleToSeeMessageThankYouForYourOrder()"
});
formatter.result({
  "duration": 56391400,
  "error_message": "org.junit.ComparisonFailure: error expected:\u003cT[hank you for your order]\u003e but was:\u003cT[HANK YOU FOR YOUR ORDER]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat com.saucedemo.steps.PurchasePageTest.iShouldBeAbleToSeeMessageThankYouForYourOrder(PurchasePageTest.java:68)\r\n\tat ✽.Then I should be able to see message \u0027Thank you for your order\u0027(purchase.feature:16)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 961540700,
  "status": "passed"
});
});