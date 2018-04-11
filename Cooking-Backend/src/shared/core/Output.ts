export interface IOutput<T> {

    onSuccess: (data: T) => void;

    onError(data: Error);
}