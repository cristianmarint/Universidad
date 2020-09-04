<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
});


Route::group(['prefix' => 'admin'], function () {
    Voyager::routes();
});


// php artisan voyager:admin cristianmarint@gmail.com --create

// carlos@gmail.com es coordinador
// carolina@gmail.com es asistente coordinacion
// julio@gmail.com es instructor
// juan@gmail.com es estudiante
