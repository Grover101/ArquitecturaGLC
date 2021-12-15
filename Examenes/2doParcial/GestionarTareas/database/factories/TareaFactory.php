<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;

class TareaFactory extends Factory
{

    public function definition()
    {
        return [
            'titulo' => $this->faker->name(),
            'tarea' => $this->faker->word(),
            'fechaInicio' => $this->faker->date(),
            'fechaConclusion' => $this->faker->date(),
            'estado' => $this->faker->randomElement(["creada", "en ejecucion", "completada"]),
        ];
    }
}

