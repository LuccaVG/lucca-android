open System
        open PokeAPI

// [...]

        async
        {
        let! p = DataFetcher.GetApiObject<PokemonSpecies> 395 |> Async.AwaitTask;
        // or:
        let! p = DataFetcher.GetNamedApiObject<PokemonSpecies> "lucario" |> Async.AwaitTask;

        let cRate = p.CaptureRate;
        // etc
        }
