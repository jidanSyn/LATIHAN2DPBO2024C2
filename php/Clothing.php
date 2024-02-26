<?php
require_once 'Product.php'; 

class Clothing extends Product {

    private $size;
    private $material;
    private $gender;

    public function __construct($id = "", $name = "", $brand = "", $price = 0, $size = "", $material = "", $gender = "") {
        parent::__construct($id, $name, $brand, $price);
        $this->size = $size;
        $this->material = $material;
        $this->gender = $gender;
    }

    // Getter and setter methods for size
    public function get_size() {
        return $this->size;
    }

    public function set_size($size) {
        $this->size = $size;
    }

    // Getter and setter methods for material
    public function get_material() {
        return $this->material;
    }

    public function set_material($material) {
        $this->material = $material;
    }

    // Getter and setter methods for gender
    public function get_gender() {
        return $this->gender;
    }

    public function set_gender($gender) {
        $this->gender = $gender;
    }
}

?>