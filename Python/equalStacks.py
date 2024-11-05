def equalStacks(h1, h2, h3):
    def cumulative_heights(heights):
        cum_heights = []
        total = 0
        for h in reversed(heights):
            total += h
            cum_heights.append(total)
        return set(cum_heights)
    heights1 = cumulative_heights(h1)
    heights2 = cumulative_heights(h2)
    heights3 = cumulative_heights(h3)
    common_heights = heights1.intersection(heights2).intersection(heights3)
    return max(common_heights) if common_heights else 0