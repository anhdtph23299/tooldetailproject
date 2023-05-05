var myApp = angular.module("myModule", ["ngRoute"]);

myApp.config(function ($routeProvider, $locationProvider) {
  $locationProvider.hashPrefix("");
  $routeProvider
    .when("/home", {
      templateUrl: "./page/home.html",
    })
    .when("/detail/:id", {
      templateUrl: "./page/detailproject.html",
      controller: detailController,
    })
    .when("/listProject", {
      templateUrl: "./page/listproject.html",
    })
    .otherwise({
      redirectTo: "/home",
    });
});
