# ==========================================
# Grocery Billing System
# ==========================================

# Dictionary of grocery items and prices
items = {
    1: {"name": "Rice", "price": 25},
    2: {"name": "Bread", "price": 3},
    3: {"name": "Milk", "price": 5},
    4: {"name": "Eggs", "price": 7},
    5: {"name": "Sugar", "price": 4},
    6: {"name": "Oil", "price": 12},
    7: {"name": "Chicken", "price": 18},
    8: {"name": "Apple", "price": 2}
}

# Shopping cart
cart = []


# Function 1
def display_items():
    print("\n========== GROCERY ITEMS ==========")
    for key, value in items.items():
        print(f"{key}. {value['name']} - RM{value['price']}")
    print()


# Function 2
def add_to_cart():
    display_items()

    try:
        choice = int(input("Enter item number: "))

        if choice not in items:
            print("Invalid item selection.")
            return

        quantity = int(input("Enter quantity: "))

        if quantity <= 0:
            print("Quantity must be greater than 0.")
            return

        cart.append({
            "name": items[choice]["name"],
            "price": items[choice]["price"],
            "quantity": quantity
        })

        print("Item added successfully!")

    except ValueError:
        print("Invalid input! Please enter numbers only.")


# Function 3
def view_cart():
    if len(cart) == 0:
        print("\nShopping cart is empty.\n")
        return

    print("\n========== SHOPPING CART ==========")

    total = 0

    for item in cart:
        subtotal = item["price"] * item["quantity"]
        total += subtotal

        print(f"{item['name']:10} x {item['quantity']} = RM{subtotal:.2f}")

    print("-----------------------------------")
    print(f"Current Total : RM{total:.2f}\n")


# Function 4
def calculate_bill():

    if len(cart) == 0:
        print("\nCart is empty.\n")
        return

    subtotal = 0

    print("\n========== BILL ==========")

    for item in cart:
        amount = item["price"] * item["quantity"]
        subtotal += amount
        print(f"{item['name']:10} x {item['quantity']} = RM{amount}")

    # Discount
    if subtotal >= 100:
        discount = subtotal * 0.10
    else:
        discount = 0

    total = subtotal - discount

    print("----------------------------")
    print(f"Subtotal : RM{subtotal:.2f}")
    print(f"Discount : RM{discount:.2f}")
    print(f"Total    : RM{total:.2f}\n")


# Function 5
def print_receipt():

    if len(cart) == 0:
        print("\nCart is empty.\n")
        return

    subtotal = 0

    print("\n===================================")
    print("         GROCERY RECEIPT")
    print("===================================")

    for item in cart:
        amount = item["price"] * item["quantity"]
        subtotal += amount
        print(f"{item['name']:10} x {item['quantity']} = RM{amount}")

    if subtotal >= 100:
        discount = subtotal * 0.10
    else:
        discount = 0

    total = subtotal - discount

    print("-----------------------------------")
    print(f"Subtotal : RM{subtotal:.2f}")
    print(f"Discount : RM{discount:.2f}")
    print(f"Grand Total : RM{total:.2f}")
    print("-----------------------------------")
    print("Thank You For Shopping!")
    print("===================================\n")


# Function 6
def main_menu():

    while True:

        print("===================================")
        print("      GROCERY BILLING SYSTEM")
        print("===================================")
        print("1. Display Grocery Items")
        print("2. Add Item to Cart")
        print("3. View Shopping Cart")
        print("4. Calculate Bill")
        print("5. Print Receipt")
        print("6. Exit")

        choice = input("Enter your choice: ")

        if choice == "1":
            display_items()

        elif choice == "2":
            add_to_cart()

        elif choice == "3":
            view_cart()

        elif choice == "4":
            calculate_bill()

        elif choice == "5":
            print_receipt()

        elif choice == "6":
            print("\nThank you for using Grocery Billing System!")
            break

        else:
            print("Invalid choice! Please try again.\n")