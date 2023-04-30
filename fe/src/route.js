var myApp = angular.module("myModule", ["ngRoute"]);

myApp.config(function ($locationProvider, $routeProvider) {
  $locationProvider.hashPrefix("");
  $routeProvider
    .when("/home", {
      TemplateUrl: "./page/home.html",
    })
    .otherwise({
      redirectTo: "/home",
    });
});
