<?php
include_once("DataController.php");
include_once("Shirt.php");

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Print the entire POST payload
    $data_controller = new DataController();

    echo "<pre>";
    print_r($_POST);
    echo "</pre>";

    $type;
    switch ($_POST['action']) {
        case 'create':
            $data_controller->create(
                $_POST['id'],
                $_POST['name'],
                $_POST['brand'],
                $_POST['price'],
                $_POST['size'],
                $_POST['material'],
                $_POST['gender'],
                $_POST['color'],
                $_POST['sleeve_type']
            );
            echo "<script>alert('Data successfully created');</script>";
            $type = 1;
            break;
        case 'update':
            $data_controller->update(
                $_SESSION['currentUpdating'],
                $_POST['name'],
                $_POST['brand'],
                $_POST['price'],
                $_POST['size'],
                $_POST['material'],
                $_POST['gender'],
                $_POST['color'],
                $_POST['sleeve_type']
            );
            $_SESSION['currentUpdating'] = null;
            $type = 2;
            break;
        case 'delete':
            $data_controller->destroy($_POST['id']);
            break;
        default:
            $type = 0;
            break;
    }

    header('Location: index.php?status=' . (string)$type);
    exit;
}
?>
