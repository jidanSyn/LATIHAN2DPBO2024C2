<?php

include_once("Shirt.php");

session_start();

class DataController {
    public function __construct() {}
    
    public function create($id, $name, $brand, $price, $size, $material, $gender, $color, $sleeve_type) {
        $_SESSION['listShirts'][] = new Shirt($id, $name, $brand, $price, $size, $material, $gender, $color, $sleeve_type);
    }

    public function getIndexById($id) {
        $index = 0;
        $shirtList = $_SESSION['listShirts'];
        foreach($shirtList as $shirt) {
            if($shirt->get_id() == $id) {
                return $index;
            }
            $index++;
        }
        return null;
    }

    public function getDataById($id) {
        $shirtList = $_SESSION['listShirts'];
        foreach($shirtList as $shirt) {
            if($shirt->get_id() == $id) {
                return $shirt;
            }
        }
        return null;
    }

    public function update($shirt, $name, $brand, $price, $size, $material, $gender, $color, $sleeve_type) {
        $shirt->set_name($name);
        $shirt->set_brand($brand);
        $shirt->set_price($price);
        $shirt->set_size($size);
        $shirt->set_material($material);
        $shirt->set_gender($gender);
        $shirt->set_color($color);
        $shirt->set_sleeve_type($sleeve_type);
    }

    public function destroy($id) {
        $index = $this->getIndexById($id);
        if ($index !== null) {
            array_splice($_SESSION['listShirts'], $index, 1);
        }
    }
}

?>

