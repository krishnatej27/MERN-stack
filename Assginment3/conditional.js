function evaluateConditions(obj) {
  // If age > 18 and hasLicense is true
  if (obj.age > 18 && obj.hasLicense) {
    return "Eligible to drive";
  }

  // If temperature > 30 or humidity > 70
  if (obj.temperature > 30 || obj.humidity > 70) {
    return "Warning: High discomfort level";
  }

  // If role is admin or editor and isActive is true
  if ((obj.role === "admin" || obj.role === "editor") && obj.isActive) {
    return "Access granted";
  }

  // Additional conditions
  if (!obj.isActive) {
    return "Account is inactive";
  }

  if (obj.age <= 18) {
    return "Underage for driving";
  }

  return "Conditions not met";
}
