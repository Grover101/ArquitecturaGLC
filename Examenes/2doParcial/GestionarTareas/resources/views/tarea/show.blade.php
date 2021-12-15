<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listar</title>
</head>

<body>
    <ul>
        <li>{{$tarea->titulo}}</li>
        <li>{{$tarea->tarea}}</li>
        <li>{{$tarea->fechaInicio}}</li>
        <li>{{$tarea->fechaConclusion}}</li>
        <li>{{$tarea->estado}}</li>
    </ul>

    <a href="{{route('tarea.edit', $tarea->id)}}">Editar</a>
    <a href="{{route('tarea.index', $tarea->id)}}">Listar</a>
</body>

</html>