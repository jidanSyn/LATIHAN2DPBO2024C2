<?php

    include_once ("DataController.php");
    include_once ("Shirt.php");

session_start();

$_SESSION['currentUpdating'] = null;

if (isset($_GET['status'])) {
    if ($_GET['status'] == 1) {
        echo "<script>alert('Data successfully created');</script>";
    } else if ($_GET["status"] == 2) {
        echo "<script>alert('Data successfully updated');</script>";
    }
}

if (!isset($_SESSION['listShirts'])) {
    $shirt1 = new Shirt(
        "SH1",
        "T-Shirt",
        "Brand X",
        20.99,
        "M",
        "Cotton",
        "Male",
        "Red",
        "Short Sleeve"
    );

    $shirt2 = new Shirt(
        "SH2",
        "Polo Shirt",
        "Brand Y",
        29.99,
        "L",
        "Polyester",
        "Female",
        "Blue",
        "Long Sleeve"
    );

    $shirt3 = new Shirt(
        "SH3",
        "Hoodie",
        "Brand Z",
        39.99,
        "XL",
        "Fleece",
        "Unisex",
        "Black",
        "Long Sleeve"
    );

    $_SESSION['listShirts'] = array($shirt1, $shirt2, $shirt3);
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRUD Application</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }

        table, th, td {
            border: 1px solid black;
            padding: 8px;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
    
</head>

<body>
<h2>Data Table</h2>

<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Brand</th>
            <th>Price</th>
            <th>Size</th>
            <th>Material</th>
            <th>Gender</th>
            <th>Color</th>
            <th>Sleeve Type</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <?php
        $listShirts = $_SESSION['listShirts'];
        foreach ($listShirts as $shirt) {
        ?>
        <tr>
            <td><?= $shirt->get_id(); ?></td>
            <td><?= $shirt->get_name(); ?></td>
            <td><?= $shirt->get_brand(); ?></td>
            <td><?= $shirt->get_price(); ?></td>
            <td><?= $shirt->get_size(); ?></td>
            <td><?= $shirt->get_material(); ?></td>
            <td><?= $shirt->get_gender(); ?></td>
            <td><?= $shirt->get_color(); ?></td>
            <td><?= $shirt->get_sleeve_type(); ?></td>
            <td>
                <form action="update.php" method="post" style="display: inline;">
                    <input type="hidden" name="id" value="<?= $shirt->get_id(); ?>">
                    <button type="submit">Edit</button>
                </form>
                <form action="process.php" method="post" style="display: inline;">
                    <input type="hidden" name="id" value="<?= $shirt->get_id(); ?>">
                    <input type="hidden" name="action" value="delete">
                    <button type="submit">Delete</button>
                </form>
            </td>
        </tr>
        <?php
        }
        ?>
    </tbody>
</table>

<h2>Add New Data</h2>

<form method="POST" action="process.php">
    <label for="id">ID:</label><br>
    <input type="text" id="id" name="id"><br>
    <label for="name">Name:</label><br>
    <input type="text" id="name" name="name"><br>
    <label for="brand">Brand:</label><br>
    <input type="text" id="brand" name="brand"><br>
    <label for="price">Price:</label><br>
    <input type="text" id="price" name="price"><br>
    <label for="size">Size:</label><br>
    <input type="text" id="size" name="size"><br>
    <label for="material">Material:</label><br>
    <input type="text" id="material" name="material"><br>
    <label for="gender">Gender:</label><br>
    <input type="text" id="gender" name="gender"><br>
    <label for="color">Color:</label><br>
    <input type="text" id="color" name="color"><br>
    <label for="sleeve_type">Sleeve Type:</label><br>
    <input type="text" id="sleeve_type" name="sleeve_type"><br><br>
    <input type="hidden" name="action" value="create">
    <input type="submit" value="Submit">
</form>
</body>
</html>
