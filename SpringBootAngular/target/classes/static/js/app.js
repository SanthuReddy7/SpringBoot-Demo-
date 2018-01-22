var UserApp = angular.module("UserApp", [])

UserApp.controller("userController", 
	function ($scope, $http)	{
		$scope.addUser = function()	{
			var request = $http( {
				method  : "POST",
				url		: "/library/add",
				data	: {
					"fName" 	: $scope.user.fName,
					"lName": $scope.user.lName,
					"phone"	: $scope.user.phone,
					"email": $scope.user.email
				}
			});
			request.success(
				function (response)	{
				angular.element(document.querySelector("#divstatus")).css("visibility", "visible");
					if (response.status == "success")	{
						angular.element(document.querySelector("#divstatus")).addClass("alert-success");
						$scope.statusmsg="Details added successfully!";
						$scope.user = null; 
					}
					else	{
						angular.element(document.querySelector("#divstatus")).addClass("alert-danger");
						$scope.statusmsg="Error:" + response.detail;
					}
				});
			
			request.error(
				function (response)	{
					angular.element(document.querySelector("#divstatus")).css("visibility", "visible");
					angular.element(document.querySelector("#divstatus")).addClass("alert-danger");
					$scope.statusmsg="Error:" + response.detail;
				});
				
		}
	
	});
