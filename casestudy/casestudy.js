function validation()
{
var N=document.getElementById('Name').value;
var T=document.getElementById('TaskID').value;
var D=document.getElementById('Description').value;
var Note=document.getElementById('Notes').value;
var B=document.getElementById('Bookmark').value;
var O=document.getElementById('OwnerID').value;
var C=document.getElementById('CreatorID').value;
var Cd=document.getElementById('CreatedDate').value;
var Md=document.getElementById('ModifiedDate').value;
if( N=='' || T=='' || D=='' ||Note==''||B=='' ||O==''||C==''||Cd==''||Md=='' )
alert("please fill all the details for creating task");
else
alert("Task Assigned successfully")
}
