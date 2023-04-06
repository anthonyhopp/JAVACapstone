package org.anthonyhopp.grocerylist.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Instructions")
public class Instructions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instruction_id")
    private int instructionId;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipeId;

    @Column(name = "step_number")
    private Integer stepNumber;

    @Column(name = "instruction_text", columnDefinition = "TEXT")
    private String instructionText;

    public Instructions() {
    }

    
    public int getInstructionId() {
        return instructionId;
    }

    public void setInstructionId(int instructionId) {
        this.instructionId = instructionId;
    }

    public Recipe getRecipe() {
        return recipeId;
    }

    public void setRecipe(Recipe recipe) {
        this.recipeId = recipe;
    }

    public Integer getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(Integer stepNumber) {
        this.stepNumber = stepNumber;
    }

    public String getInstructionText() {
        return instructionText;
    }

    public void setInstructionText(String instructionText) {
        this.instructionText = instructionText;
    }
}
