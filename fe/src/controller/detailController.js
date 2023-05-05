window.detailController = function ($scope, $http, $location) {
  var url = $location.absUrl().split("/");
  var id = url[url.length - 1];
  $http.get(urlUserDetail + "/" + id).then(function (response) {
    console.log(response.data);
  });
};
