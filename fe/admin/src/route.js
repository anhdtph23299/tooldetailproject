var myApp = angular.module("myModule", ["ngRoute"]);

myApp.config(function ($routeProvider, $locationProvider) {
  $locationProvider.hashPrefix("");
  $routeProvider

    .when("/login", {
      templateUrl: "./page/login.html",
    })
    .when("/admin", {
      templateUrl: "./page/account.html",
    })
    .otherwise({
      redirectTo: "/admin",
    });
});
