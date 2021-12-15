<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listar</title>
</head>
<body>

    <table border="1">
        <tr>
            <th>titulo</th>
            <th>tarea</th>
            <th>fechaInicio</th>
            <th>fechaConclusion</th>
            <th>estado</th>
            <th>Acciones</th>
        </tr>
        @foreach($tarea as $tarea)
        <tr>
            <td>{{$tarea->titulo}}</td>
            <td>{{$tarea->tarea}}</td>
            <td>{{$tarea->fechaInicio}}</td>
            <td>{{$tarea->fechaConclusion}}</td>
            <td>{{$tarea->estado}}</td>
            <td>
                <a href="{{route('tarea.edit', $tarea->id)}}">Editar</a>
                <a href="{{route('tarea.show', $tarea->id)}}">Mostrar</a>
                <form action="{{route('tarea.destroy', $tarea->id)}}" method="POST">
                    @csrf
                    @method('DELETE')
                    <input type="submit" value="Eliminar">
                </form>
                
        </tr>
        @endforeach
    </table>
    <a href="{{route('tarea.create')}}">Insertar</a>
    
</body>
</html>