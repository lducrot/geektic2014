var app = angular.module("geektic", ['ngRoute']);

phonecatApp.config(['$routeProvider',
function($routeProvider) {
  $routeProvider.
    when('/geeksList', {
      templateUrl: 'partials/geeksList.html',
      controller: 'GeeksListCtrl'
    }).
    when('/geeks/:geekId', {
      templateUrl: 'partials/geekDetail.html',
      controller: 'GeekDetailCtrl'
    }).
    otherwise({
      redirectTo: '/geeks'
    });
}]);



/*app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
});*/

