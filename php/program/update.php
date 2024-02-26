<?php
// Include necessary files
include_once("DataController.php");
include_once("Shirt.php");

// Initialize variables
$id = null;
$name = "";
$brand = "";
$price = 0;
$size = "";
$material = "";
$gender = "";
$color = "";
$sleeve_type = "";

// Check if ID is provided in the URL
if (isset($_POST["id"])) {
    // Retrieve the ID from the URL
    $id = $_POST["id"];
    // Retrieve data for the specified ID
    $data_controller = new DataController();
    $shirt = $data_controller->getDataById($id); // Implement this method in your DataController class

    $_SESSION['currentUpdating'] = $shirt;
    

    // Check if data exists for the given ID
    if ($shirt) {
        // Populate variables with data values
        $name = $shirt->get_name();
        $brand = $shirt->get_brand();
        $price = $shirt->get_price();
        $size = $shirt->get_size();
        $material = $shirt->get_material();
        $gender = $shirt->get_gender();
        $color = $shirt->get_color();
        $sleeve_type = $shirt->get_sleeve_type();
    } else {
        // Data not found for the given ID, handle accordingly (e.g., display error message)
        echo 'not found';
    }
}

?>

<!DOCTYPE html>
<html>
<head>
    <title>Update Data</title>
</head>
<body>
    <h2>Update Data</h2>
    <form action="process.php" method="post">
        <input type="hidden" name="action" value="update">
        <input type="hidden" name="id" value="<?php echo $id; ?>">
        <label>Name:</label><br>
        <input type="text" name="name" value="<?php echo $name; ?>"><br>
        <label>Brand:</label><br>
        <input type="text" name="brand" value="<?php echo $brand; ?>"><br>
        <label>Price:</label><br>
        <input type="text" name="price" value="<?php echo $price; ?>"><br>
        <label>Size:</label><br>
        <input type="text" name="size" value="<?php echo $size; ?>"><br>
        <label>Material:</label><br>
        <input type="text" name="material" value="<?php echo $material; ?>"><br>
        <label>Gender:</label><br>
        <input type="text" name="gender" value="<?php echo $gender; ?>"><br>
        <label>Color:</label><br>
        <input type="text" name="color" value="<?php echo $color; ?>"><br>
        <label>Sleeve Type:</label><br>
        <input type="text" name="sleeve_type" value="<?php echo $sleeve_type; ?>"><br><br>
        <button type="submit">Update</button>
    </form>
</body>
</html>
