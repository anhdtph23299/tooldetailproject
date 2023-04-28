var myApp = angular.module("myModule", ["ngRoute"]);

myApp.config(function ($locationProvider, $routeProvider) {
  $locationProvider.hashPrefix("");
  $routeProvider
    .when("", {
      TemplateUrl: "",
      controller: "",
    })
    .otherwise({
      redirectTo: "",
    });
});
