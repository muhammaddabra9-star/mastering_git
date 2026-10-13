const { createApp } = Vue;

createApp({
    data() {
        return {
            display: "0",
            storedValue: null,
            operator: null,
            waitingForNextValue: false,
            history: [],
            buttons: [
                { label: "C", type: "utility", action: "clear" },
                { label: "±", type: "utility", action: "toggleSign" },
                { label: "%", type: "utility", action: "percent" },
                { label: "÷", type: "operator", action: "operator", value: "/" },
                { label: "7", action: "digit" },
                { label: "8", action: "digit" },
                { label: "9", action: "digit" },
                { label: "×", type: "operator", action: "operator", value: "*" },
                { label: "4", action: "digit" },
                { label: "5", action: "digit" },
                { label: "6", action: "digit" },
                { label: "-", type: "operator", action: "operator", value: "-" },
                { label: "1", action: "digit" },
                { label: "2", action: "digit" },
                { label: "3", action: "digit" },
                { label: "+", type: "operator", action: "operator", value: "+" },
                { label: "0", action: "digit" },
                { label: ".", action: "decimal" },
                { label: "=", type: "equal", action: "equals" }
            ],
            features: [
                {
                    label: "Vue interface",
                    title: "Reactive display",
                    copy: "Every number, operator, and result updates through Vue state instead of manual DOM changes."
                },
                {
                    label: "Java inspired",
                    title: "Based on StylishCalculator.java",
                    copy: "The web version keeps the same calculator idea while giving it a browser-friendly layout."
                },
                {
                    label: "Project ready",
                    title: "Easy to expand",
                    copy: "The structure can grow into a full portfolio page, a math tool, or a backend-connected Java app."
                }
            ]
        };
    },
    computed: {
        expression() {
            if (this.operator && this.storedValue !== null) {
                return `${this.formatNumber(this.storedValue)} ${this.operatorLabel(this.operator)}`;
            }

            return "Ready";
        },
        latestHistory() {
            return this.history.slice(0, 5);
        }
    },
    methods: {
        press(button) {
            if (button.action === "digit") {
                this.inputDigit(button.label);
                return;
            }

            if (button.action === "decimal") {
                this.inputDecimal();
                return;
            }

            if (button.action === "operator") {
                this.chooseOperator(button.value);
                return;
            }

            this[button.action]();
        },
        inputDigit(digit) {
            if (this.waitingForNextValue) {
                this.display = digit;
                this.waitingForNextValue = false;
                return;
            }

            this.display = this.display === "0" ? digit : `${this.display}${digit}`;
        },
        inputDecimal() {
            if (this.waitingForNextValue) {
                this.display = "0.";
                this.waitingForNextValue = false;
                return;
            }

            if (!this.display.includes(".")) {
                this.display += ".";
            }
        },
        chooseOperator(nextOperator) {
            const inputValue = Number.parseFloat(this.display);

            if (this.operator && !this.waitingForNextValue) {
                const result = this.calculate(this.storedValue, inputValue, this.operator);
                this.addHistory(this.storedValue, inputValue, this.operator, result);
                this.display = this.formatNumber(result);
                this.storedValue = result;
            } else {
                this.storedValue = inputValue;
            }

            this.operator = nextOperator;
            this.waitingForNextValue = true;
        },
        equals() {
            if (!this.operator || this.storedValue === null || this.waitingForNextValue) {
                return;
            }

            const inputValue = Number.parseFloat(this.display);
            const result = this.calculate(this.storedValue, inputValue, this.operator);

            this.addHistory(this.storedValue, inputValue, this.operator, result);
            this.display = this.formatNumber(result);
            this.storedValue = null;
            this.operator = null;
            this.waitingForNextValue = true;
        },
        calculate(firstValue, secondValue, operator) {
            if (operator === "+") {
                return firstValue + secondValue;
            }

            if (operator === "-") {
                return firstValue - secondValue;
            }

            if (operator === "*") {
                return firstValue * secondValue;
            }

            if (operator === "/") {
                return secondValue === 0 ? 0 : firstValue / secondValue;
            }

            return secondValue;
        },
        clear() {
            this.display = "0";
            this.storedValue = null;
            this.operator = null;
            this.waitingForNextValue = false;
        },
        toggleSign() {
            if (this.display === "0") {
                return;
            }

            this.display = this.display.startsWith("-") ? this.display.slice(1) : `-${this.display}`;
        },
        percent() {
            const value = Number.parseFloat(this.display) / 100;
            this.display = this.formatNumber(value);
        },
        addHistory(firstValue, secondValue, operator, result) {
            const entry = `${this.formatNumber(firstValue)} ${this.operatorLabel(operator)} ${this.formatNumber(secondValue)} = ${this.formatNumber(result)}`;
            this.history.unshift(entry);
            this.history = this.history.slice(0, 8);
        },
        operatorLabel(operator) {
            return {
                "+": "+",
                "-": "-",
                "*": "×",
                "/": "÷"
            }[operator];
        },
        formatNumber(value) {
            if (!Number.isFinite(value)) {
                return "0";
            }

            return Number.parseFloat(value.toFixed(10)).toString();
        }
    },
    template: `
        <div class="app-shell">
            <header class="site-header">
                <a class="brand" href="#top" aria-label="SmartCalc Studio home">
                    <span class="brand-mark">SC</span>
                    <span>SmartCalc Studio</span>
                </a>
                <nav class="nav-links" aria-label="Main navigation">
                    <a href="#calculator">Calculator</a>
                    <a href="#features">Features</a>
                    <a href="#source">Source</a>
                </nav>
            </header>

            <main id="top">
                <section class="hero">
                    <div>
                        <p class="eyebrow">Vue website for a Java project</p>
                        <h1>A browser version of the Stylish Calculator project.</h1>
                        <p class="hero-copy">
                            This redesign turns the Java Swing calculator into a responsive Vue experience with real calculations,
                            recent history, and a project-focused presentation.
                        </p>
                        <div class="hero-actions">
                            <a class="button" href="#calculator">Use calculator</a>
                            <a class="button secondary" href="#source">View project idea</a>
                        </div>
                    </div>

                    <div class="calculator-stage" id="calculator">
                        <div class="code-panel" aria-hidden="true">
                            <pre>public class StylishCalculator {
  JTextField textField;
  double num1 = 0;
  char operator;

  public static void main(String[] args) {
    new StylishCalculator();
  }
}</pre>
                        </div>

                        <section class="calculator" aria-label="Vue calculator">
                            <div class="calc-topbar">
                                <span class="status-pill"><span class="status-dot"></span>Vue active</span>
                                <span>StylishCalculator.java</span>
                            </div>
                            <div class="display" aria-live="polite">
                                <div class="expression">{{ expression }}</div>
                                <div class="screen-value">{{ display }}</div>
                            </div>
                            <div class="keys">
                                <button
                                    v-for="button in buttons"
                                    :key="button.label"
                                    class="key"
                                    :class="[button.type]"
                                    type="button"
                                    @click="press(button)"
                                >
                                    {{ button.label }}
                                </button>
                            </div>
                        </section>
                    </div>
                </section>

                <section class="section" id="features">
                    <div class="section-heading">
                        <p class="eyebrow">What changed</p>
                        <h2>From desktop Swing window to a modern web interface.</h2>
                        <p>The Java project is still the idea. Vue now handles the interaction layer for the website.</p>
                    </div>

                    <div class="feature-grid">
                        <article class="feature-card" v-for="feature in features" :key="feature.title">
                            <span>{{ feature.label }}</span>
                            <h3>{{ feature.title }}</h3>
                            <p>{{ feature.copy }}</p>
                        </article>
                    </div>
                </section>

                <section class="section workspace-grid" id="source">
                    <article class="history-card">
                        <p class="eyebrow">Recent calculations</p>
                        <h2>History</h2>
                        <ul v-if="latestHistory.length" class="history-list">
                            <li v-for="item in latestHistory" :key="item">
                                <span>{{ item }}</span>
                            </li>
                        </ul>
                        <div v-else class="empty-state">
                            Run a calculation and it will appear here.
                        </div>
                    </article>

                    <article class="source-card">
                        <p class="eyebrow">Java connection</p>
                        <h2>Original project concept</h2>
                        <p class="hero-copy">
                            The desktop project used Java Swing buttons, a text field, and action listeners. This page keeps the same
                            calculator flow while using Vue state, methods, computed text, and template rendering.
                        </p>
                        <pre>Vue.createApp({
  data() { return { display: "0" }; },
  methods: {
    inputDigit(digit) {
      this.display = this.display === "0" ? digit : this.display + digit;
    }
  }
});</pre>
                    </article>
                </section>
            </main>

            <footer class="site-footer">
                Built with Vue 3 for the StylishCalculator Java project.
            </footer>
        </div>
    `
}).mount("#app");
