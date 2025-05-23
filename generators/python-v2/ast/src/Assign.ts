import { AstNode } from "./core/AstNode";
import { Writer } from "./core/Writer";

export declare namespace Assign {
    interface Args {
        lhs: AstNode;
        rhs: AstNode;
    }
}

export class Assign extends AstNode {
    private readonly lhs: AstNode;
    private readonly rhs: AstNode;

    constructor({ lhs, rhs }: Assign.Args) {
        super();

        this.lhs = lhs;
        this.inheritReferences(lhs);

        this.rhs = rhs;
        this.inheritReferences(rhs);
    }

    public write(writer: Writer): void {
        this.lhs.write(writer);
        writer.write(" = ");
        this.rhs.write(writer);
    }
}
