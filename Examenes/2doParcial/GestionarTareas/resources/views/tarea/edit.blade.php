<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listar</title>
</head>
<body>
    <form action="{{route('tarea.update',$tarea->id)}}" method="POST">
        @csrf
        @method('PUT')
        <input type="text" name="titulo" placeholder="titulo" value="{{$tarea->titulo}}"><br>
        <input type="text" name="tarea" placeholder="tarea" value="{{$tarea->tarea}}"><br>
        <input type="date" name="fechaInicio" placeholder="fechaInicio" value="{{$tarea->fechaInicio}}"><br>
        <input type="date" name="fechaConclusion" placeholder="fechaConclusion" value="{{$tarea->fechaConclusion}}"><br>

        <select name="estado">
            <option value="{{$tarea->estado}}">{{$tarea->estado}}</option>
            <option value="creada">creada</option>
            <option value="en ejecucion">en ejecucion</option>
            <option value="completada">completada</option>
        </select>
        <input type="submit" value="Editar">

    </form>

</body>
</html>