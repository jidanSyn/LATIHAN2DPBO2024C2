j<?php

class Product {
    private $id;
    private $name;
    private $brand;
    private $price;
    
    public function __construct($id, $name="", $brand="", $price=0) {
        $this->id = $id;
        $this->name = $name;
        $this->brand = $brand;
        $this->price = $price;
    }

    public function set_id($id) {
        $this->id = $id;
    }

    public function set_name($name) {
        $this->name = $name;
    }

    public function set_brand($brand) {
        $this->brand = $brand;
    }
    public function set_price($price) {
        $this->price = $price;
    }
    public function get_id() {
        return $this->id;
    }
    public function get_name() {
        return $this->name;
    }
    public function get_brand() {
        return $this->brand;
    }
    public function get_price() {
        return $this->price;
    }

}

?>