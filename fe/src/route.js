var myApp = angular.module("myModule", ["ngRoute"]);

myApp.config(function ($routeProvider, $locationProvider) {
  $locationProvider.hashPrefix("");
  $routeProvider
    .when("/home", {
      templateUrl: "./page/home.html",
    })
    .when("/detail", {
      templateUrl: "./page/detailproject.html",
    })
    .otherwise({
      redirectTo: "/detail",
    });
});
