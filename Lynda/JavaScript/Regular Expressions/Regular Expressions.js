/**
 * Created with JetBrains WebStorm.
 * User: debeach
 * Date: 5/24/13
 * Time: 3:15 PM
 * To change this template use File | Settings | File Templates.
 */

var string1 = "This is the longest string ever";
var string2 = "This is the shortest string ever";
var string3 = "Is this the thing called Mount Everest?";
var string4 = "This is the Sherman on the Mount.";

var regex = /ever$/i;

console.log(regex.test(string1));
console.log(regex.test(string2));
console.log(regex.test(string3));
console.log(regex.test(string4));