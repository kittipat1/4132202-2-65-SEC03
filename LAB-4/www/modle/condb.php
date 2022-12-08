<?php
$host = "db";
$user = "root";
$pass = "1234";
$port = 3306;

try{
    $link = mysqli_connect($host,$user,$db,$port);
    mysqli_query($link,"SET NAMES utf8");
}catch (Exception $e){
   echo $e . "::" . mysqli_errno($link);
}

?>