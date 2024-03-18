package org.example.ast;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;

@Data
@Builder
@AllArgsConstructor
public class MethodDeclList {
    private ArrayList<MethodDecl> methodDecls;
}
