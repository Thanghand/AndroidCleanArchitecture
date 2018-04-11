import { IOutput } from "../core/Output";

export default abstract class UseCase<Input, Output> {

    output: IOutput<Output>;
    abstract buildUseCase(input?: Input): Promise<Output>;
    
    execute(input?: Input): Promise<Output> {
        return this.buildUseCase(input);
    }
}