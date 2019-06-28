(function(){
    'use strict';
    angular
        .module('app')
        .controller('RegisterController',RegisterController);
    RegisterController.$inject=['UserService','$location'];
    function RegisterController(UserService,$location) {
        var vm=this;
        vm.register=register;

        vm.dataLoading=false;
        function register() {
            vm.dataLoading=true;
            UserService.create(vm.user)
                .then(function (response) {
                    if(response.success){
                        alert('Registration Successful');

                    }else {
                        alert(response.message);
                        vm.dataLoading-false;

                    }

                    $location.path('/');
                    
                });
        }

    }

})();