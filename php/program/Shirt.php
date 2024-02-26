<?php

require_once 'Clothing.php'; 

class Shirt extends Clothing {

    private $color;
    private $sleeve_type;

    public function __construct($id = "", $name = "", $brand = "", $price = 0, $size = "", $material = "", $gender = "", $color = "", $sleeve_type = "") {
        parent::__construct($id, $name, $brand, $price, $size, $material, $gender);
        $this->color = $color;
        $this->sleeve_type = $sleeve_type;
    }

    // Getter and setter methods for color
    public function get_color() {
        return $this->color;
    }

    public function set_color($color) {
        $this->color = $color;
    }

    // Getter and setter methods for sleeve_type
    public function get_sleeve_type() {
        return $this->sleeve_type;
    }

    public function set_sleeve_type($sleeve_type) {
        $this->sleeve_type = $sleeve_type;
    }
}
  

?>